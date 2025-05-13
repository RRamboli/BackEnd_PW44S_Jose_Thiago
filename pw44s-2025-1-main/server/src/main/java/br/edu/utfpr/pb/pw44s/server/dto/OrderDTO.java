package br.edu.utfpr.pb.pw44s.server.dto;

import br.edu.utfpr.pb.pw44s.server.model.Order;
import br.edu.utfpr.pb.pw44s.server.model.User;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {

    private Long id;
    private User user;
    private Order.OrderStatus status;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;
    private BigDecimal total;
    private BigDecimal totalShipping;
    private Order.PaymentType payment;
    private String name;
    private String lastName;
    private String cpf;
    private LocalDateTime birth;
    private String email;
    private String ddd;
    private String telephone;
    private String city;
    private String cep;
    private String state;
    private String address;
    private String neighborhood;
    private String reference;
}
