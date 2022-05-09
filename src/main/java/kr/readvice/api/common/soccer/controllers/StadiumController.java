package kr.readvice.api.common.soccer.controllers;

import kr.readvice.api.common.soccer.services.StadiumService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName   : kr.readvice.api.common.soccer.controllers
 * fileName      : StadiumController
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         2022-05-09        최초 생성
 */
@RestController
@RequestMapping("/stadium")
@RequiredArgsConstructor
public class StadiumController {
    private final StadiumService service;
}
