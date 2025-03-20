<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Session Value Display</title>
    <style>
        
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #00c6ff, #0072ff);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            color: white;
        }

        /* Container for the displayed session value */
        .content {
            background: rgba(255, 255, 255, 0.2);
            padding: 30px;
            border-radius: 12px;
            text-align: center;
            width: 80%;
            max-width: 400px;
        }

        /* Heading Styling */
        h1 {
            font-size: 24px;
            margin-bottom: 20px;
        }

        /* Displayed session value styling */
        .session-value {
            font-size: 20px;
            font-weight: bold;
            padding: 10px;
            background-color: rgba(0, 114, 255, 0.7);
            border-radius: 8px;
            word-wrap: break-word;
        }
    </style>
</head>
<body>

    <div class="content">
        <h1>Session Value:</h1>
        <p class="session-value">
            <%
                String s = (String) session.getAttribute("Hi");
                if (s != null) {
                    out.println(s);
                } else {
                    out.println("No session data found.");
                }
            %>
        </p>
    </div>

</body>
</html>
