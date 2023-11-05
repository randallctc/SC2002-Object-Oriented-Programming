public class selector {
    public static void selectoptions(Student student, int choice){
        switch(choice){
            case 1:	colossusAirLine.showNumEmptySeats();
					break;
				
			//show list of empty seats
			case 2:	colossusAirLine.showEmptySeats();
					break;
				
			//show list of assigned seats sorted by seat id in ascending order
			case 3:	colossusAirLine.showAssignedSeats(true);
					break;
        }
    }

    public static void selectoptions(Staff astaff, int choice){
        switch(choice){
            case 1:	colossusAirLine.showNumEmptySeats();
					break;
				
			//show list of empty seats
			case 2:	colossusAirLine.showEmptySeats();
					break;
				
			//show list of assigned seats sorted by seat id in ascending order
			case 3:	colossusAirLine.showAssignedSeats(true);
					break;
        }

    }

    public static void selectoptions(Campcomittee acampcomittee, int choice){
        switch(choice){
            case 1:	colossusAirLine.showNumEmptySeats();
					break;
				
			//show list of empty seats
			case 2:	colossusAirLine.showEmptySeats();
					break;
				
			//show list of assigned seats sorted by seat id in ascending order
			case 3:	colossusAirLine.showAssignedSeats(true);
					break;
        }
    }
}

