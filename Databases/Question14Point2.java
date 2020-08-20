public class Question14Point2 {
    //Select BuildingName, ISNULL(Count, 0) as 'Count' from Buildings
    //LEFT JOIN (Select Apartments.BuildingID, count(*) as 'Count' From Requests Inner Join Apartments ON requests.AptID = Apartments.APTID
    //Where Requests.status = 'Open' Group by Apartments.BuildingID) Counters On Counters.BuildingID = Buildings.BuildingID
}
