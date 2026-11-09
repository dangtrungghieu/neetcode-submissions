-- Write your query below
SELECT cus.customer_id, cus.customer_name
FROM customers cus
WHERE 
    EXISTS (
        SELECT 1
        FROM orders ord
        WHERE ord.customer_id = cus.customer_id 
        AND ord.product_name = 'A'
    )
    AND EXISTS (
        SELECT 1
        FROM orders ord
        WHERE ord.customer_id = cus.customer_id 
        AND ord.product_name = 'B'
    )
    AND NOT EXISTS (
        SELECT 1
        FROM orders ord
        WHERE ord.customer_id = cus.customer_id 
        AND ord.product_name = 'C'
    )
ORDER BY cus.customer_name;