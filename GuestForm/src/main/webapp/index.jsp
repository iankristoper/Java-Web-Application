<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Guestbook</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            margin: 20px;
        }
        .container {
            width: 50%;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            color: #333;
        }
        form {
            margin: 20px 0;
        }
        input, textarea {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            background: #28a745;
            color: white;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            border-radius: 5px;
        }
        button:hover {
            background: #218838;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        li {
            background: #ddd;
            padding: 10px;
            margin: 5px;
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Guestbook</h2>
        <form action="guestProcess" method="POST">
            <input type="text" name="name" placeholder="Your Name" required>
            <br>
            <textarea name="message" placeholder="Your Message" required></textarea>
            <br>
            <button type="submit">Submit</button>
        </form>

        <h3>Messages:</h3>
        <ul>
            <%
                List<String> messages = (List<String>) application.getAttribute("messages");
                if (messages != null) {
                    for (String msg : messages) {
            %>
                    <li><%= msg %></li>
            <%
                    }
                } else {
            %>
                    <li>No messages yet.</li>
            <%
                }
            %>
        </ul>
    </div>
</body>
</html>
