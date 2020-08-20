public class Question14Point7 {
    //There will be three main tables, a Student table, School table, and CourseInfo table
    //The Student table will include personal info, and School table contains basic data about the school
    //The CourseInfo table has the SchoolID and StudentID from their respecitve tables and also has the grade
    //Now to find the top 10%,
    // Declare @Grade float
    //Set @Grade = (Select min(Grade) as 'minGrade' From(Select Top 10 Percent AVG(CourseInfo.Grade) As Grade from CourseInfo.StudentID
    //Group by CourseInfo.StudentID Order By Grade desc) Grades)
    //Select StudentName, Grade From (Select CourseInfo.Grade as Grade, CourseInfo.StudentID from CourseInfo Group By CourseINfo.StudentID Having Grade>=@Grade) HonorRoll
    //Inner Join Students on HonorRoll.StudentID = Student.StudentID
}
