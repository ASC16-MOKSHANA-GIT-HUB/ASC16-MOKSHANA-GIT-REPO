-- 1
SELECT * FROM SalesLT.Product;

-- 2
SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice > 1000;

-- 3
SELECT TOP 10 Name, ListPrice FROM SalesLT.Product ORDER BY ListPrice DESC;

-- 4
SELECT ProductID, Name FROM SalesLT.Product WHERE Color = 'Red';

-- 5
SELECT Name, Color, ListPrice FROM SalesLT.Product WHERE Color IS NOT NULL;

-- 6
SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice BETWEEN 500 AND 1500;

-- 7
SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice IN (500, 1000, 1500);

-- 8
SELECT Name FROM SalesLT.Product WHERE Name LIKE '%Mountain%';

-- 9
SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice > (SELECT AVG(ListPrice) FROM SalesLT.Product);

-- 10
SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice > 0 ORDER BY ListPrice DESC;

-- 11
SELECT ProductID, Name FROM SalesLT.Product WHERE ListPrice = (SELECT MAX(ListPrice) FROM SalesLT.Product);

-- 12
SELECT p.Name, pc.Name AS Category FROM SalesLT.Product p INNER JOIN SalesLT.ProductCategory pc ON p.ProductCategoryID = pc.ProductCategoryID;

-- 13
SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice < 1000 ORDER BY ListPrice ASC;

-- 14
SELECT TOP 5 Name, ListPrice FROM SalesLT.Product ORDER BY ListPrice DESC;

-- 15
SELECT ProductID, Name, ListPrice FROM SalesLT.Product WHERE ListPrice > 2000;

-- 16
SELECT Name, Color FROM SalesLT.Product WHERE Color LIKE 'B%';

-- 17
SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice >= 500 AND ListPrice <= 1500;

-- 18
SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice IN (600, 1200);

-- 19
SELECT Name, ListPrice FROM SalesLT.Product WHERE Name LIKE '%Touring%';

-- 20
SELECT Name FROM SalesLT.Product WHERE Name LIKE 'L%';

-- 21
SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice > (SELECT AVG(ListPrice) FROM SalesLT.Product);

-- 22
SELECT ProductID, Name FROM SalesLT.Product WHERE ListPrice = (SELECT MIN(ListPrice) FROM SalesLT.Product);

-- 23
SELECT ProductID, Name, ListPrice FROM SalesLT.Product WHERE ListPrice BETWEEN 300 AND 700;

-- 24
SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice > 500 ORDER BY ListPrice DESC;

-- 25
SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice < 1000 ORDER BY ListPrice ASC;

-- 26
SELECT Name, Color FROM SalesLT.Product WHERE Color IS NOT NULL;

-- 27
SELECT ProductID, Name FROM SalesLT.Product WHERE ListPrice > 1000;

-- 28
SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice > 0 ORDER BY ListPrice DESC;

-- 29
SELECT TOP 3 Name, ListPrice FROM SalesLT.Product ORDER BY ListPrice DESC;

-- 30
SELECT Name FROM SalesLT.Product WHERE Name LIKE '%Mountain%';

-- 31
SELECT p.Name AS ProductName, pc.Name AS CategoryName FROM SalesLT.Product p INNER JOIN SalesLT.ProductCategory pc ON p.ProductCategoryID = pc.ProductCategoryID;

-- 32
SELECT soh.SalesOrderID, c.FirstName, c.LastName, soh.OrderDate, soh.TotalDue FROM SalesLT.SalesOrderHeader soh INNER JOIN SalesLT.Customer c ON soh.CustomerID = c.CustomerID;

-- 33
SELECT sod.SalesOrderID, p.Name, sod.OrderQty, sod.UnitPrice, sod.LineTotal FROM SalesLT.SalesOrderDetail sod INNER JOIN SalesLT.Product p ON sod.ProductID = p.ProductID;

-- 34
SELECT c.FirstName, c.LastName, a.AddressLine1, a.City, a.StateProvince, a.PostalCode FROM SalesLT.Customer c INNER JOIN SalesLT.CustomerAddress ca ON c.CustomerID = ca.CustomerID INNER JOIN SalesLT.Address a ON ca.AddressID = a.AddressID;

-- 35
SELECT p.Name AS ProductName, pc.Name AS Category, pcp.Name AS ParentCategory FROM SalesLT.Product p INNER JOIN SalesLT.ProductCategory pc ON p.ProductCategoryID = pc.ProductCategoryID LEFT JOIN SalesLT.ProductCategory pcp ON pc.ParentProductCategoryID = pcp.ProductCategoryID;

-- 36
SELECT soh.SalesOrderID, c.FirstName, c.LastName, p.Name AS ProductName, sod.OrderQty, sod.UnitPrice, sod.LineTotal FROM SalesLT.SalesOrderHeader soh INNER JOIN SalesLT.Customer c ON soh.CustomerID = c.CustomerID INNER JOIN SalesLT.SalesOrderDetail sod ON soh.SalesOrderID = sod.SalesOrderID INNER JOIN SalesLT.Product p ON sod.ProductID = p.ProductID;

-- 37
SELECT p.ProductID, p.Name FROM SalesLT.Product p LEFT JOIN SalesLT.SalesOrderDetail sod ON p.ProductID = sod.ProductID WHERE sod.ProductID IS NULL;

-- 38
SELECT c.CustomerID, c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalSpending FROM SalesLT.Customer c INNER JOIN SalesLT.SalesOrderHeader soh ON c.CustomerID = soh.CustomerID GROUP BY c.CustomerID, c.FirstName, c.LastName;

-- 39
      

-- 40
SELECT soh.SalesOrderID, a.AddressLine1, a.City, a.StateProvince, a.PostalCode FROM SalesLT.SalesOrderHeader soh INNER JOIN SalesLT.Address a ON soh.ShipToAddressID = a.AddressID;

-- 41
SELECT pc.Name AS Category, COUNT(*) AS ProductCount FROM SalesLT.Product p INNER JOIN SalesLT.ProductCategory pc ON p.ProductCategoryID = pc.ProductCategoryID GROUP BY pc.Name HAVING COUNT(*) > 10;

-- 42
SELECT c.CustomerID, c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalPurchases FROM SalesLT.Customer c INNER JOIN SalesLT.SalesOrderHeader soh ON c.CustomerID = soh.CustomerID GROUP BY c.CustomerID, c.FirstName, c.LastName HAVING SUM(soh.TotalDue) > 10000;

-- 43
SELECT p.ProductID, p.Name, SUM(sod.OrderQty) AS TotalSold FROM SalesLT.Product p INNER JOIN SalesLT.SalesOrderDetail sod ON p.ProductID = sod.ProductID GROUP BY p.ProductID, p.Name HAVING SUM(sod.OrderQty) > 100;

-- 44
SELECT Color, AVG(ListPrice) AS AvgPrice, COUNT(*) AS ProductCount FROM SalesLT.Product WHERE Color IS NOT NULL GROUP BY Color HAVING AVG(ListPrice) > 500;

-- 45
SELECT YEAR(OrderDate) AS Year, SUM(TotalDue) AS TotalSales FROM SalesLT.SalesOrderHeader GROUP BY YEAR(OrderDate) HAVING SUM(TotalDue) > 1000000;

-- 46
SELECT c.CustomerID, c.FirstName, c.LastName, COUNT(*) AS OrderCount FROM SalesLT.Customer c INNER JOIN SalesLT.SalesOrderHeader soh ON c.CustomerID = soh.CustomerID GROUP BY c.CustomerID, c.FirstName, c.LastName HAVING COUNT(*) > 3;

-- 47
SELECT p.Name, AVG(sod.OrderQty) AS AvgOrderQty FROM SalesLT.Product p INNER JOIN SalesLT.SalesOrderDetail sod ON p.ProductID = sod.ProductID GROUP BY p.Name HAVING AVG(sod.OrderQty) > 5;

-- 48
SELECT a.City, COUNT(DISTINCT c.CustomerID) AS CustomerCount FROM SalesLT.Address a INNER JOIN SalesLT.CustomerAddress ca ON a.AddressID = ca.AddressID INNER JOIN SalesLT.Customer c ON ca.CustomerID = c.CustomerID GROUP BY a.City HAVING COUNT(DISTINCT c.CustomerID) > 5;

-- 49
SELECT pc.Name AS Category, SUM(sod.LineTotal) AS TotalSales FROM SalesLT.Product p INNER JOIN SalesLT.SalesOrderDetail sod ON p.ProductID = sod.ProductID INNER JOIN SalesLT.ProductCategory pc ON p.ProductCategoryID = pc.ProductCategoryID GROUP BY pc.Name HAVING SUM(sod.LineTotal) > 50000;

-- 50
SELECT YEAR(OrderDate) AS Year, MONTH(OrderDate) AS Month, COUNT(*) AS OrderCount FROM SalesLT.SalesOrderHeader GROUP BY YEAR(OrderDate), MONTH(OrderDate) HAVING COUNT(*) > 50;

-- 51
SELECT Name, ListPrice FROM SalesLT.Product WHERE ListPrice > (SELECT AVG(ListPrice) FROM SalesLT.Product);

-- 52
SELECT CustomerID, FirstName, LastName FROM SalesLT.Customer WHERE CustomerID IN (SELECT CustomerID FROM SalesLT.SalesOrderHeader WHERE YEAR(OrderDate) = 2008);

-- 53
SELECT p.Name, p.ListPrice, pc.Name AS Category FROM SalesLT.Product p INNER JOIN SalesLT.ProductCategory pc ON p.ProductCategoryID = pc.ProductCategoryID WHERE p.ListPrice = (SELECT MAX(p2.ListPrice) FROM SalesLT.Product p2 WHERE p2.ProductCategoryID = p.ProductCategoryID);

-- 54
SELECT c.CustomerID, c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalPurchases FROM SalesLT.Customer c INNER JOIN SalesLT.SalesOrderHeader soh ON c.CustomerID = soh.CustomerID GROUP BY c.CustomerID, c.FirstName, c.LastName HAVING SUM(soh.TotalDue) > (SELECT AVG(CustomerTotal) FROM (SELECT SUM(TotalDue) AS CustomerTotal FROM SalesLT.SalesOrderHeader GROUP BY CustomerID) AS Totals);

-- 55
SELECT ProductID, Name FROM SalesLT.Product WHERE ProductID NOT IN (SELECT DISTINCT ProductID FROM SalesLT.SalesOrderDetail);

-- 56
SELECT SalesOrderID, TotalDue FROM SalesLT.SalesOrderHeader WHERE TotalDue > (SELECT AVG(TotalDue) FROM SalesLT.SalesOrderHeader);

-- 57
SELECT TOP 5 c.CustomerID, c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalPurchases FROM SalesLT.Customer c INNER JOIN SalesLT.SalesOrderHeader soh ON c.CustomerID = soh.CustomerID GROUP BY c.CustomerID, c.FirstName, c.LastName ORDER BY TotalPurchases DESC;

-- 58
SELECT p.Name FROM SalesLT.Product p WHERE p.ProductCategoryID = (SELECT TOP 1 ProductCategoryID FROM (SELECT p2.ProductCategoryID, AVG(p2.ListPrice) AS AvgPrice FROM SalesLT.Product p2 GROUP BY p2.ProductCategoryID) AS CatAvg ORDER BY CatAvg.AvgPrice DESC);

-- 59
SELECT c.CustomerID, c.FirstName, c.LastName FROM SalesLT.Customer c INNER JOIN SalesLT.CustomerAddress ca ON c.CustomerID = ca.CustomerID INNER JOIN SalesLT.Address a ON ca.AddressID = a.AddressID WHERE a.City IN (SELECT TOP 3 a2.City FROM SalesLT.Address a2 INNER JOIN SalesLT.CustomerAddress ca2 ON a2.AddressID = ca2.AddressID GROUP BY a2.City ORDER BY COUNT(DISTINCT ca2.CustomerID) DESC);

-- 60
SELECT p.Name FROM SalesLT.Product p WHERE p.ListPrice > (SELECT AVG(p2.ListPrice) FROM SalesLT.Product p2 WHERE p2.ProductCategoryID = p.ProductCategoryID);

-- 61
SELECT DATENAME(WEEKDAY, OrderDate) AS Weekday, COUNT(*) AS OrderCount FROM SalesOrderHeader GROUP BY DATENAME(WEEKDAY, OrderDate) ORDER BY OrderCount DESC;

-- 62
SELECT * FROM SalesOrderHeader WHERE OrderDate >= DATEADD(DAY, -30, (SELECT MAX(OrderDate) FROM SalesOrderHeader));

-- 63
SELECT ProductID, DATEDIFF(DAY, SellStartDate, GETDATE()) AS DaysSinceFirstSold FROM Product;

-- 64
SELECT YEAR(OrderDate) AS Year, DATEPART(QUARTER, OrderDate) AS Quarter, COUNT(*) AS OrderCount FROM SalesOrderHeader GROUP BY YEAR(OrderDate), DATEPART(QUARTER, OrderDate) ORDER BY Year, Quarter;

-- 65
SELECT * FROM Product WHERE YEAR(SellStartDate) = 2005;

-- 66
SELECT SalesOrderID, DATEDIFF(DAY, OrderDate, ShipDate) AS DaysToShip FROM SalesOrderHeader WHERE ShipDate IS NOT NULL;

-- 67
SELECT FORMAT(OrderDate, 'yyyy-MM') AS YearMonth, COUNT(*) AS OrderCount, SUM(TotalDue) AS TotalSales FROM SalesOrderHeader GROUP BY FORMAT(OrderDate, 'yyyy-MM') ORDER BY YearMonth;

-- 68
SELECT * FROM Product WHERE SellStartDate <= GETDATE() AND (SellEndDate IS NULL OR SellEndDate >= GETDATE());

-- 69
SELECT CustomerID, MIN(OrderDate) AS FirstOrderDate, MAX(OrderDate) AS LastOrderDate FROM SalesOrderHeader GROUP BY CustomerID;

-- 70
SELECT * FROM Product WHERE YEAR(SellEndDate) = 2006;

-- 71
SELECT CustomerID, FirstName + ' ' + LastName AS FullName FROM Customer;

-- 72
SELECT CustomerID, SUBSTRING(EmailAddress, CHARINDEX('@', EmailAddress) + 1, LEN(EmailAddress)) AS EmailDomain FROM Customer;

-- 73
SELECT ProductID, UPPER(Name) AS UpperCaseName FROM Product;

-- 74
SELECT ProductID, Name FROM Product WHERE LEN(Name) > 20;

-- 75
SELECT ProductID, REPLACE(ProductNumber, ' ', '') AS ProductNumberNoSpaces FROM Product;

-- 76
SELECT ProductID, LEFT(Name, 3) AS FirstThreeLetters FROM Product;

-- 77
SELECT CustomerID, REPLACE(REPLACE(REPLACE(Phone, '(', ''), ')', ''), '-', '') AS PhoneUnformatted FROM Customer;

-- 78
SELECT CustomerID, LEFT(FirstName, 1) + LEFT(LastName, 1) AS Initials FROM Customer;

-- 79
SELECT ProductID, REVERSE(Name) AS ReversedName FROM Product;

-- 80
SELECT * FROM Product WHERE CHARINDEX('Bike', Name) > 0;

-- 81
SELECT ProductID, Name, ListPrice, RANK() OVER (ORDER BY ListPrice DESC) AS PriceRank FROM Product;

-- 82
SELECT CustomerID, FirstName, LastName, ROW_NUMBER() OVER (ORDER BY LastName, FirstName) AS RowNum FROM Customer;

-- 83
SELECT ProductID, ProductCategoryID, Name, ListPrice, DENSE_RANK() OVER (PARTITION BY ProductCategoryID ORDER BY ListPrice DESC) AS CategoryPriceRank FROM Product;
