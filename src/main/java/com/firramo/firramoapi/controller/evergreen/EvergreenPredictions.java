package com.firramo.firramoapi.controller.evergreen;

import com.firramo.firramoapi.model.evergreen.VipPick;

import com.firramo.firramoapi.service.evergreen.EvergreenVipPickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/evergreen/predictions")
public class EvergreenPredictions {
    @Autowired
    private EvergreenVipPickService pickService;


    @PostMapping("/vip-picks")
    public VipPick vipPicks(@RequestBody VipPick pick){
        return pickService.savePick(pick);
    }

    @PostMapping("/vip-picks/{id}")
    public VipPick vipPick(@PathVariable("id") long id, @RequestBody VipPick pick){
        return pickService.updatePick(id, pick);
    }

    @GetMapping("/vip-picks")
    public List<VipPick> vipPicks(){
        return pickService.getPicks();
    }

}
