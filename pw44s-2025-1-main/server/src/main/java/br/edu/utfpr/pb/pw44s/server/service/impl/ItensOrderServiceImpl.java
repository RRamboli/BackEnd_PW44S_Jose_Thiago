package br.edu.utfpr.pb.pw44s.server.service.impl;

import br.edu.utfpr.pb.pw44s.server.model.ItensOrder;
import br.edu.utfpr.pb.pw44s.server.repository.ItensOrderRepository;
import br.edu.utfpr.pb.pw44s.server.service.IItensOrderService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ItensOrderServiceImpl extends CrudServiceImpl<ItensOrder, Long> implements IItensOrderService {
    private final ItensOrderRepository  itensOrderRepository;

    public ItensOrderServiceImpl(ItensOrderRepository itensOrderRepository) {
        this.itensOrderRepository = itensOrderRepository;
    }

    @Override
    protected JpaRepository<ItensOrder, Long> getRepository() {
        return this.itensOrderRepository;
    }
}
