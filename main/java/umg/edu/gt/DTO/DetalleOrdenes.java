/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.DTO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Wilmer de Mata
 */

@Entity
@Table(name = "detalles_ordenes")
public class DetalleOrdenes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idOrdenDetalle;
    @Column(name = "orden_id")
    private String OrdenID;
    @Column(name = "producto_id")
    private String ProductoId;
    @Column(name = "cantidad")
    private String cantidadDetalle;
    @Column(name = "precio")
    private String precioDetalle;
    /**
     * @return the idOrdenDetalle
     */
    public Long getIdOrdenDetalle() {
        return idOrdenDetalle;
    }

    /**
     * @param idOrdenDetalle the idOrdenDetalle to set
     */
    public void setIdOrdenDetalle(Long idOrdenDetalle) {
        this.idOrdenDetalle = idOrdenDetalle;
    }

    /**
     * @return the OrdenID
     */
    public String getOrdenID() {
        return OrdenID;
    }

    /**
     * @param OrdenID the OrdenID to set
     */
    public void setOrdenID(String OrdenID) {
        this.OrdenID = OrdenID;
    }

    /**
     * @return the ProductoId
     */
    public String getProductoId() {
        return ProductoId;
    }

    /**
     * @param ProductoId the ProductoId to set
     */
    public void setProductoId(String ProductoId) {
        this.ProductoId = ProductoId;
    }

    /**
     * @return the cantidadDetalle
     */
    public String getCantidadDetalle() {
        return cantidadDetalle;
    }

    /**
     * @param cantidadDetalle the cantidadDetalle to set
     */
    public void setCantidadDetalle(String cantidadDetalle) {
        this.cantidadDetalle = cantidadDetalle;
    }

    /**
     * @return the precioDetalle
     */
    public String getPrecioDetalle() {
        return precioDetalle;
    }

    /**
     * @param precioDetalle the precioDetalle to set
     */
    public void setPrecioDetalle(String precioDetalle) {
        this.precioDetalle = precioDetalle;
    }
    

    
}
