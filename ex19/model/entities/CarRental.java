package ex19.model.entities;

import java.time.LocalDateTime;

public class CarRental {
    
    private LocalDateTime start;
    private LocalDateTime finish;

    private Vehicle vehicle;
    private Invoice Invoice;

    public CarRental(){

    }

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle){
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Invoice getInvoice() {
        return Invoice;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setInvoice(Invoice invoice) {
        Invoice = invoice;
    }

}
