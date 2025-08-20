<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Feedback Management</title>
    <style>
    body {
      margin: 0;
      padding: 0;
      background-color: #99d9ea;
      font-family: Arial, sans-serif;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .form-container {
      background-color: #fff;
      padding: 70px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0,0,0,0.2);
      width: 400px;
      
    }

    h2 {
      text-align: center;
      font-size:40px; 
      color: #d10000;
      margin-bottom: 100px;
      margin-right:-400px;
      margin-left:100px;
      
    }

    label {
      display: block;
      margin-top: 10px;
      font-weight: bold;
      padding:10px;
    }

    input[type="text"], textarea {
      width: 100%;
      padding: 8px;
      margin-top: 5px;
      margin-bottom: 10px;
      border: 1px solid #ccc;
      border-radius: 5px;
    }

    input[type="submit"] {
      width: 100%;
      padding: 10px;
      background-color: #007bff;
      color: white;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #0056b3;
    }
   .star-rating {
  direction: rtl;
  display: inline-flex;
  font-size: 24px;
}

.star-rating input[type="radio"] {
  display: none;
}

.star-rating label {
  color: #ccc;
  cursor: pointer;
  transition: color 0.2s;
}

.star-rating input[type="radio"]:checked ~ label {
  color: gold;
}

.star-rating label:hover,
.star-rating label:hover ~ label {
  color: gold;
}
input[type="submit"] {
  margin-top: 20px;
  padding: 10px;
  background-color: #007bff;
  color: white;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: background-color 0.3s ease, transform 0.2s ease;
}

input[type="submit"]:hover {
  background-color: #0056b3;
  transform: scale(1.05); /* slight zoom effect */
}
.star-rating label {
  color: #ccc;
  cursor: pointer;
  transition: color 0.3s ease, transform 0.2s ease;
}

.star-rating input[type="radio"]:checked ~ label,
.star-rating label:hover,
.star-rating label:hover ~ label {
  color: gold;
  transform: scale(1.2); /* slightly enlarges star on hover */
}
    
    </style>
    
</head>

<body>
    <h2 style="margin-top:-500px;">FEEDBACK FORM</h2>
    
    
    <form action="submit" method="post">
        
        Name:   <input type="text" name="name" /><br/>
       Email:  <input type="text" name="email" /><br>
       Course:  <input type="text" name="course" />
     
Rating:
<div class="star-rating">
  <input type="radio" id="star5" name="rating" value="5" /><label for="star5" title="5 stars">&#9733;</label>
  <input type="radio" id="star4" name="rating" value="4" /><label for="star4" title="4 stars">&#9733;</label>
  <input type="radio" id="star3" name="rating" value="3" /><label for="star3" title="3 stars">&#9733;</label>
  <input type="radio" id="star2" name="rating" value="2" /><label for="star2" title="2 stars">&#9733;</label>
  <input type="radio" id="star1" name="rating" value="1" /><label for="star1" title="1 star">&#9733;</label>
</div>
<br/>
        Message: <textarea name="message" ></textarea><br/>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>