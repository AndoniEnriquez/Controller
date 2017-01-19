/*
 * 
 */
package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.FlightsDAO;
import db_items.Flights;

/**
 * The Class FlightsAction.
 */
public class FlightsAction extends ActionSupport {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The flights. */
	private Flights flights;
	
	/** The flights list. */
	private List<Flights> flightsList;
	
	/** The flights dao. */
	private FlightsDAO flightsDao;
	
	/** The id. */
	private int id;
	
	/**
	 * Instantiates a new flights action.
	 */
	public FlightsAction(){
		flightsDao = new FlightsDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
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
	
	/**
	 * List.
	 *
	 * @return the string
	 */
	public String list(){
		this.flightsList = flightsDao.list();
		return SUCCESS;
	}

	/**
	 * Gets the flights.
	 *
	 * @return the flights
	 */
	public Flights getFlights() {
		return flights;
	}

	/**
	 * Sets the flights.
	 *
	 * @param flights the new flights
	 */
	public void setFlights(Flights flights) {
		this.flights = flights;
	}

	/**
	 * Gets the flights list.
	 *
	 * @return the flights list
	 */
	public List<Flights> getFlightsList() {
		return flightsList;
	}

	/**
	 * Sets the flights list.
	 *
	 * @param flightsList the new flights list
	 */
	public void setFlightsList(List<Flights> flightsList) {
		this.flightsList = flightsList;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
}
