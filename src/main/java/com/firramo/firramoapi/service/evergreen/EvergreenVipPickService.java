package com.firramo.firramoapi.service.evergreen;

import com.firramo.firramoapi.model.evergreen.VipPick;
import com.firramo.firramoapi.repository.evergreen.EvergreenVipPickRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvergreenVipPickService {
    @Autowired
    private EvergreenVipPickRepo pickRepo;

    public VipPick savePick(VipPick pick){
        return pickRepo.save(pick);
    }
//    Todo: complete the update function
    public VipPick updatePick(long id, VipPick pick){
        return null;
    }

    public List<VipPick> getPicks(){
        return pickRepo.findAll();
    }
}
