<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="CSS\MyCart.css">
</head>
    
<body>
    <h1>Your Cart</h1>
    <form action="*" method="post">
        <!-- BẮT ĐẦU VÒNG LẶP -->
        <div class="product">
            <div class="column left">
                <img src="*" alt="Product">
            </div>
            <div class="column middle">
                <h2>Name product</h2>
                <p>Price:&nbsp&nbsp&nbsp<!-- Price --></p>
                <p>Quantity:&nbsp&nbsp <input type="number" value="*" min="0" max="9999999999"></p>
            </div>
            <div class="column right">
                <input type="button" value="Update"/></br>
                <input type="button" value="Detail"/>
            </div>
        </div>
        <!-- KẾT THÚC VÒNG LẶP -->
        <h3>Total amount:<!-- Tong Tien --></h3></br>
        <div class="order">
            <input type="button" value="Order">
        </div>
    </form>
</body>

</html>