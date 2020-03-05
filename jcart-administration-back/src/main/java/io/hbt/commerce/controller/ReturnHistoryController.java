package io.hbt.commerce.controller;

import io.hbt.commerce.dto.in.ReturnHistoryCreateInDTO;
import io.hbt.commerce.dto.out.ReturnHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/returnhistory")
@CrossOrigin
public class ReturnHistoryController {

    @GetMapping("/getListByReturnId")
    public List<ReturnHistoryListOutDTO> getListByReturnId(
            @RequestParam Integer returnId
    ){
        return null;
    }

    @PostMapping("/create")
    public Integer create(
            @RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO
    ){
        return null;
    }
}
