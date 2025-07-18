SELECT P_E.ID, COUNT(E.ID) AS CHILD_COUNT
FROM ECOLI_DATA AS P_E 
LEFT JOIN ECOLI_DATA AS E 
ON P_E.ID = E.PARENT_ID
GROUP BY P_E.ID
ORDER BY P_E.ID ASC;