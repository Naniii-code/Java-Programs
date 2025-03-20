<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.AdminBean"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>WelcomeAdmin</title>
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
            text-align: center;
        }

       
        .welcome-container {
            background: rgba(255, 255, 255, 0.2);
            padding: 30px;
            border-radius: 12px;
            text-align: center;
            width: 80%;
            max-width: 400px;
        }

       
        h1 {
            font-size: 24px;
            margin-bottom: 20px;
        }

       
        .admin-name {
            font-size: 22px;
            font-weight: bold;
            color: #ff7e5f;
            padding: 10px;
            background-color: rgba(255, 255, 255, 0.6);
            border-radius: 8px;
            margin-top: 20px;
            display: inline-block;
        }
    </style>
</head>
<body>

    <div class="welcome-container">
        <h1>Welcome to the AdminDashboard</h1>
        <p class="admin-name">
            <%
                AdminBean ab = (AdminBean) session.getAttribute("abean");
                if (ab != null) {
                    out.println("Welcome Admin: " + ab.getAdminlname());
                } else {
                    out.println("No admin found.");
                }
            %>
        </p>
    </div>

</body>
</html>
