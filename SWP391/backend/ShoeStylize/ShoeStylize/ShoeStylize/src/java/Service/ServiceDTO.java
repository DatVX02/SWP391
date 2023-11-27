/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author duong
 */
public class ServiceDTO {
    private int ServiceID;
    private int OutLeftCost;
     private int OutRightCost;
      private int InLeftCost;
     private int InRightCost;
     private int BackCost;
      private int OverlookCost;

    public ServiceDTO(int ServiceID, int OutLeftCost, int OutRightCost, int InLeftCost, int InRightCost, int BackCost, int OverlookCost) {
        this.ServiceID = ServiceID;
        this.OutLeftCost = OutLeftCost;
        this.OutRightCost = OutRightCost;
        this.InLeftCost = InLeftCost;
        this.InRightCost = InRightCost;
        this.BackCost = BackCost;
        this.OverlookCost = OverlookCost;
    }

    public ServiceDTO() {
    }

    

    public int getServiceID() {
        return ServiceID;
    }

    public void setServiceID(int ServiceID) {
        this.ServiceID = ServiceID;
    }

    public int getOutLeftCost() {
        return OutLeftCost;
    }

    public void setOutLeftCost(int OutLeftCost) {
        this.OutLeftCost = OutLeftCost;
    }

    public int getOutRightCost() {
        return OutRightCost;
    }

    public void setOutRightCost(int OutRightCost) {
        this.OutRightCost = OutRightCost;
    }

    public int getInLeftCost() {
        return InLeftCost;
    }

    public void setInLeftCost(int InLeftCost) {
        this.InLeftCost = InLeftCost;
    }

    public int getInRightCost() {
        return InRightCost;
    }

    public void setInRightCost(int InRightCost) {
        this.InRightCost = InRightCost;
    }

    public int getBackCost() {
        return BackCost;
    }

    public void setBackCost(int BackCost) {
        this.BackCost = BackCost;
    }

    public int getOverlookCost() {
        return OverlookCost;
    }

    public void setOverlookCost(int OverlookCost) {
        this.OverlookCost = OverlookCost;
    }
      
}