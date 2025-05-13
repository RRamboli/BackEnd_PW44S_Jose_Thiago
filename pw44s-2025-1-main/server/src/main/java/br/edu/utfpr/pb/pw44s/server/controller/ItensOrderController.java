package br.edu.utfpr.pb.pw44s.server.controller;

import br.edu.utfpr.pb.pw44s.server.dto.ItensOrderDTO;
import br.edu.utfpr.pb.pw44s.server.model.ItensOrder;
import br.edu.utfpr.pb.pw44s.server.service.ICrudService;
import br.edu.utfpr.pb.pw44s.server.service.IItensOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("products")
public class ItensOrderController extends CrudController<ItensOrder, ItensOrderDTO, Long> {
    private final IItensOrderService itensOrderService;
    private final ModelMapper modelMapper;

    public ItensOrderController(IItensOrderService itensOrderService, ModelMapper modelMapper) {
        super(ItensOrder.class, ItensOrderDTO.class);
        this.itensOrderService = itensOrderService;
        this.modelMapper = modelMapper;
    }

    @Override
    protected ICrudService<ItensOrder, Long> getService() {
        return this.itensOrderService;
    }

    @Override
    public ModelMapper getModelMapper() {
        return modelMapper;
    }
}
