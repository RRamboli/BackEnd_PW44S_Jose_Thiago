package br.edu.utfpr.pb.pw44s.server.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_order")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @NotNull
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @NotNull
    private LocalDateTime  creationDate;

    @NotNull
    private LocalDateTime updateDate;

    @NotNull
    private BigDecimal total;

    @NotNull
    private BigDecimal totalShipping;

    @NotNull
    @Enumerated(EnumType.STRING)
    private PaymentType payment;

    @NotNull
    @Size(max = 100)
    private String name;

    @NotNull
    @Size(max = 100)
    private String lastName;

    @NotNull
    @Size(min =11 ,max = 14)
    private String cpf;

    @NotNull
    private LocalDateTime birth;

    @NotNull
    @Size(max = 50)
    private String email;

    @Size(min = 3, max = 3)
    private String ddd;

    @Size(min = 8, max = 10)
    private String telephone;

    @NotNull
    @Size(max = 50)
    private String city;

    @NotNull
    @Size(min = 8,max = 9)
    private String cep;

    @NotNull
    @Size(min = 2,max = 2)
    private String state;

    @NotNull
    @Size(min = 5,max = 150)
    private String address;

    @NotNull
    @Size(min = 5,max = 100)
    private String neighborhood;

    private String reference;

    public enum OrderStatus {
        CART, // Carrinho em andamento
        PENDING, // Pedido finalizado, aguardando pagamento
        PAID, // Pedido pago
        SHIPPED, // Pedido enviado
        DELIVERED, // Pedido entregue
        CANCELLED // Pedido cancelado
    }

    public enum PaymentType  {
        PIX, // Pix
        DEBIT_CARD, // Cartão de Débito
        CREDIT_CARD, // Cartão de Crédito
        TICKET // Boleto
    }

    @PrePersist
    public void prePersist() {
        creationDate = LocalDateTime.now();
        updateDate = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        updateDate = LocalDateTime.now();
    }


}
