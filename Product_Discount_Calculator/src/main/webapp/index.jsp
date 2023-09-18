<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product Discount Calculator</title>
    <style>
        body {
            font-family:"Times New Roman", sans-serif;
            font-size: 16px;
        }
        h1 {
            font-size: 24px;
            font-weight: bold;
        }
        label {
            font-weight: bold;
        }
        input {
            font-size: 16px;
        }
        button {
            font-size: 16px;
            font-weight: bold;
        }
    </style>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="display-discount" method="POST">
    <div>
        <label for="product-description">Mô tả Sản phẩm:</label>
        <input type="text" id="product-description" name="productDescription" />
    </div>
    <div>
        <label for="list-price">Bảng giá:</label>
        <input type="number" id="list-price" name="listPrice" />
    </div>
    <div>
        <label for="discount-percent">Phần trăm chiết khấu:</label>
        <input type="number" id="discount-percent" name="discountPercent" />
    </div>
    <button type="submit">Tính chiết khấu</button>
</form>
</body>
</html>