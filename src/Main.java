import BusniessLogics.*;
import daoPackage.*;
import pocoPackage.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        Repository rp =new Repository();
//        rp.getConnection("//localhost:5432/FLIGHTS_MANAGEMENT");
//        System.out.println(rp.getStatement());

        //AdministratorsDAO adm = new AdministratorsDAO();
        //Administrator ad= new Administrator(1,"naama","knoll",1243);
        //System.out.println(adm.get(1));

        //adm.add(new Administrator(12,"moshe","Knoll",12));
        //adm.remove(new Administrator(1,"Helga","Nutkin",1));
        //adm.update(new Administrator(12,"harri","potter",12));
        //System.out.println(adm.getAll());

        //AirlineCompaniesDAO ard=new AirlineCompaniesDAO();
        //System.out.println(ard.getAirlineByUsername("naama"));
        //System.out.println(ard.get(2));
        //ard.add(new AirlineCompany(2,"arkia",2,4));
        //ard.remove(new AirlineCompany(2,"arkia",2,4));
        //ard.update(new AirlineCompany(2,"swiss",2,7));
        //System.out.println(ard.get(2));
        //System.out.println(ard.getAirlinesByCountry(3));
        //System.out.println(ard.getAirlineByName("swiss"));
        //System.out.println(ard.getAirlineByUsername("naama"));
        //System.out.println(ard.getAll());


        //CountriesDAO cn=new CountriesDAO();
        //System.out.println(cn.get(2));
        //cn.add(new Country(11,"brazil"));
        //cn.remove(new Country(11,"brazil"));
        //cn.update(new Country(1,"new-york"));
        //System.out.println(cn.getAll());


        //CustomersDAO cm=new CustomersDAO();
        //System.out.println(cm.getCustomerByUsername("Blisse"));
        //cm.add(new Customer(3,"dodo","hgg","petach-tikva 123","0508762345","4567987512346683",6));
        //System.out.println(cm.get(1));
        //cm.remove(new Customer(1,"dodo","hgg","petach-tikva 123","0508762345","4567987512346683",6));
        //cm.update(new Customer(1,"toviya","menashe","ramat-gan 45","0456787654","7865434564334",4));
        //System.out.println(cm.getAll());
        //System.out.println(cm.getCustomerByUsername("Blisse"));

        //FlightsDAO flight =new FlightsDAO();
        //System.out.println(flight.getFlightsByCustomer(1));
        //System.out.println(flight.getFlightsByDepartureDate("2022-04-21 23:00:00.0"));
        //System.out.println(flight.getFlightsByLandingDate("2022-04-22 05:30:00.0"));
        //System.out.println(flight.getFlightsByOriginCountryId(1));
        //System.out.println(flight.get(1));
        //flight.add(new Flight(2,2,2,1,"2022-03-21 23:00:00","2022-03-22 01:30:00",15));
        //flight.update(new Flight(2,2,1,2,"2022-05-03 10:00:00","2022-05-03 17:33:00",4));
        //flight.remove(new Flight(2,2,1,2,"2022-05-03 10:00:00","2022-05-03 17:33:00",4));
        //System.out.println(flight.getAll());
        //System.out.println(flight.getFlightsByOriginCountryId(1));
        //System.out.println(flight.getFlightsByDestinationCountryId(2));
        //System.out.println(flight.getFlightsByAirlineId(1));
        //System.out.println(flight.getArrivalFlights(2));
        //System.out.println(flight.getDepartureFlights(1));
        //System.out.println(flight.getFlightByParameters(1,2,"2022-04-12 12:20:20"));
        //System.out.println(flight.getArrivalFlights(1));
        //System.out.println(flight.getDepartureFlights(2));

        //TicketsDAO ticketsDAO=new TicketsDAO();
        //System.out.println(ticketsDAO.getTicketByCustomer(2));
        //ticketsDAO.add(new Ticket(3,1,1));
        //System.out.println(ticketsDAO.get(1));
        //ticketsDAO.update(new Ticket(1,1,2));
        //System.out.println(ticketsDAO.getAll());

        //UsersDAO usersDAO=new UsersDAO();
        //System.out.println(usersDAO.getUserByUsername("naama"));
        //usersDAO.add(new User(1,"ari","ari2021","ari@gmail.com",2));
        //usersDAO.update(new User(13,"ari","ari2021","ari@gmail.com",1));
        //System.out.println(usersDAO.get(13));
        //usersDAO.remove(new User(13,"ari","ari2021","ari@gmail.com",2));
        //System.out.println(usersDAO.getAll());

        //AnonymousFacade anonymousFacade=new AnonymousFacade();
        //System.out.println(anonymousFacade.login("naama","12345"));

        //AirlineFacade airlineFacade=new AirlineFacade(anonymousFacade.login("naama","12345"));
        //System.out.println(airlineFacade.getMyFlights());

        //AnonymousFacade anonymousFacade1=new AnonymousFacade();
        //System.out.println(anonymousFacade1.getAllFlights());
        //System.out.println(anonymousFacade1.getFlightById(1));
        //System.out.println(anonymousFacade1.getFlightsByParameters(1,2,"2022-04-13 00:00:00.0"));
        //System.out.println(anonymousFacade1.getAllAirlines());
        //System.out.println(anonymousFacade1.getAirlineById(2));
        //System.out.println(anonymousFacade1.getAirlineByParameters("swiss"));
        //System.out.println(anonymousFacade1.getAllCountries());
        //System.out.println(anonymousFacade1.getCountryById(12));

        //anonymousFacade1.addCustomer(new Customer(1,"gery","cohen","rosh-haayn","0567364858",null,2),new User(1,"gery","vnd7464","gery@gmail.com",1));
        //LoginToken lg=anonymousFacade1.login("yehuda","yehud1234");
        //System.out.println(lg);
        //AdministratorFacade admin=new AdministratorFacade(lg);
        //System.out.println(admin.getAllCustomers());
//        CustomersDAO customersDAO=new CustomersDAO();
//        System.out.println(customersDAO.get(2));
        //System.out.println(admin.removeCustomer(new Customer(2,"dodo","hgg","petach-tikva 123","0508762345","4567987512346683",6)));
        //System.out.println(admin.addAirlineCompany(new AirlineCompany(1,"esyget",1,4),new User(1,"easyget","comp4536","easy@gmail.com",2)));
        //System.out.println(admin.removeAirlineCompany(new AirlineCompany(4,"esyget",1,24)));
        //System.out.println(admin.addAdministrator(new Administrator(1,"hodi","zuhabi",1),new User(1,"hodi","hodi5656","hodi@gmail.com",3)));
        //System.out.println(admin.removeAdministrator(new Administrator(3,"hodi","zuhabi",25)));
        //AirlineFacade airlineFacade=new AirlineFacade(lg);
        //System.out.println(airlineFacade.getMyFlights());
        //System.out.println(airlineFacade.updateAirline(new AirlineCompany(1,"elal",4,1)));
        //customerFacade.addTicket(new Ticket(1,3,5));
        //System.out.println(customerFacade.updateCustomer(new Customer(1,"blisee","bil","ramat-aviv","0523556609","4580765478983456",4)));
        //customerFacade.addTicket(new Ticket(1,4,1));
        //customerFacade.removeTicket(new Ticket(5,4,1));
        //System.out.println(customerFacade.getMyTickets());

        //System.out.println(airlineFacade.checkFlightValues(new Flight(1,2,2,1,"2022-03-22 12:20:00","2022-03-22 10:15:00",7)));
        //System.out.println(airlineFacade.addFlight(new Flight(1,2,2,1,"2022-04-24 12:20:00","2022-04-24 18:15:00",70)));
        //System.out.println(airlineFacade.updateFlight(new Flight(6,2,2,1,"2022-04-24 12:20:00","2022-04-24 18:15:00",60)));
        //System.out.println(airlineFacade.removeFlight(new Flight(6,2,2,1,"2022-04-24 12:20:00","2022-04-24 18:15:00",60)));
//        UsersDAO usersDAO=new UsersDAO();
//        usersDAO.remove(new User(16,"gery","vnd7464","gery@gmail.com",1));

 //       CustomersDAO customersDAO=new CustomersDAO();
   //     customersDAO.remove(new Customer(4,"gery","cohen","rosh-haayn","0567364858",null,2));
        FlightsDAO flightsDAO=new FlightsDAO();
        System.out.println(flightsDAO.getFlightByParameters(1,2,"2022-04-12"));

    }

}
