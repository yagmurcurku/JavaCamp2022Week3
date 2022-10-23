--Yorum satırı
Select ContactName Ad, CompanyName SirketAdi, City Sehir from Customers

Select * from Customers where City='London'

--case insessitive
SelECt * from Products 

Select * from Products where CategoryID=1 or CategoryID = 3

Select * from Products where CategoryID=1 and UnitPrice>=10

Select * from Products order by UnitPrice asc     -- ascending = artan
Select * from Products order by UnitPrice desc    -- descending = azalan

Select * from Products order by CategoryID, ProductName

Select * from Products where CategoryID=1 order by UnitPrice

Select COUNT(*) from Products    -- count = adet 

Select COUNT(*) from Products where CategoryID = 2

Select CategoryID from Products group by CategoryID

Select CategoryID,count(*) from Products group by CategoryID

--ürün sayısı 10'dan az olan kategorileri listele
Select CategoryID,COUNT(*) from Products group by CategoryID having COUNT(*)<10  --having = where

--Birim fiyatı 20'den fazla olan ürünleri CategoryID'ye göre grupla, bu gruplarda ürün sayısı 10'dan az olanları listele
Select CategoryID,COUNT(*) from Products where UnitPrice>20 group by CategoryID having COUNT(*)<10  

Select * from Products inner join Categories
on Products.CategoryID=Categories.CategoryID
--on : durumunda/şartında

Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories on Products.CategoryID=Categories.CategoryID


Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories on Products.CategoryID=Categories.CategoryID
where Products.UnitPrice>10

Select * from Products p inner join [Order Details] od on p.ProductID=od.ProductID

Select * from Products p left join [Order Details] od on p.ProductID=od.ProductID

Select * from Customers c left join Orders o on c.CustomerID=o.CustomerID

Select * from Customers c left join Orders o on c.CustomerID=o.CustomerID where o.CustomerID is null

--birden fazla join
Select * from Products p inner join [Order Details] od on p.ProductID=od.ProductID
inner join Orders o on o.OrderID=od.OrderID

