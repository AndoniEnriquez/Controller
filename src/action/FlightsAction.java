package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.FlightsDAO;
import db_items.Flights;

public class FlightsAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Flights flights;
	private List<Flights> flightsList;
	private FlightsDAO flightsDao;
	private int id;
	
	public FlightsAction(){
		flightsDao = new FlightsDAO();
	}
	
	public String execute(){
		if (flightsDao.list() != null) {
			this.flightsList = flightsDao.list();
			for (int i = 0; i < flightsList.size(); i++){
				this.flightsList.get(i).setPlane_name(flightsDao.getPlaneName(flightsList.get(i).getPlane_id()));
				this.flightsList.get(i).setGate_name(flightsDao.getGateName(flightsList.get(i).getGate_id()));
				this.flightsList.get(i).setRoute_name(flightsDao.getRouteName(flightsList.get(i).getRoute_id()));
				this.flightsList.get(i).setAirline_name(flightsDao.getAirlineName(flightsList.get(i).getPlane_id()));
			}
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String list(){
		this.flightsList = flightsDao.list();
		return SUCCESS;
	}

	public Flights getFlights() {
		return flights;
	}

	public void setFlights(Flights flights) {
		this.flights = flights;
	}

	public List<Flights> getFlightsList() {
		return flightsList;
	}

	public void setFlightsList(List<Flights> flightsList) {
		this.flightsList = flightsList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
