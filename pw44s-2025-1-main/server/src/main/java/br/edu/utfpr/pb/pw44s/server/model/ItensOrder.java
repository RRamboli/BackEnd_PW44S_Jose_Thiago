package br.edu.utfpr.pb.pw44s.server.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_itensOrder")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItensOrder {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    private String size;

    private String color;

    private String name;

    private String description;

    private BigDecimal unitPrice;

    private BigDecimal quantity;

    private BigDecimal totalPrice;

}
