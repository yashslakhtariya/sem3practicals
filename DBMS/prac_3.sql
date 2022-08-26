SELECT * FROM Cricket where  (Team1="India"  AND Team2="England") OR (Team1="England" AND Team2="India");

SELECT * FROM Cricket WHERE Winner="India" AND WinByWicket>5;

SELECT * FROM Cricket WHERE Winner="India" AND WinByRuns>50;

SELECT Ground FROM Cricket WHERE Winner = "Australia" AND WinByRuns > 50;

SELECT * FROM Cricket WHERE Team1 = "india" OR Team2 = "India" AND Ground = "Wellington";

SELECT * FROM Cricket WHERE Winner = "India" AND Ground = "Sydney";

SELECT * FROM Cricket WHERE Ground = "Sydney" AND (WinByWicket > 3 OR WinByRuns > 50);

SELECT * FROM Cricket WHERE Winner = "India" AND (WinByRuns > 50 or WinByWicket > 5);     

SELECT Ground FROM Cricket WHERE (Team1="India" OR Team2="India") AND Winner <> "India";

SELECT * FROM Cricket WHERE Winner = "India" OR Winner = "Australia";

SELECT * FROM Cricket WHERE (Winner = "India" OR Winner = "Australia") AND WinByRuns > 100;

SELECT * FROM Cricket WHERE (Winner = "India" or Winner = "Australia") AND WinByWicket > 5;

SELECT * FROM Cricket WHERE WinByRuns > 100 OR WinByWicket > 5;


SELECT * FROM Cricket WHERE Ground like "S%";

SELECT * FROM Cricket WHERE Ground like "S%" OR Ground like "D%";

SELECT Winner, WinByRuns FROM Cricket WHERE Ground like "S%y";

SELECT Ground FROM Cricket WHERE Ground like "D____%";

SELECT Team1, Team2, Winner FROM Cricket WHERE Ground like "%on%";

SELECT * FROM Cricket WHERE Ground like "_e%";

SELECT Ground FROM Cricket WHERE Ground like ("A%") OR Ground like ("B%") OR Ground like ("C%");
