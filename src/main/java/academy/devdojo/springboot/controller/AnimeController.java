package academy.devdojo.springboot.controller;

import academy.devdojo.springboot.domain.Anime;
import academy.devdojo.springboot.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {
    //a forma mais correta é usando interface para obedecer o DI do SOLID e o spring procurar o objeto concreto
//    @Autowired
    private final DateUtil dateUtil;

//    public AnimeController(DateUtil dateUtil) {
//        this.dateUtil = dateUtil;
//    }

    //See about context in path, like: localhost:8080/context/list
    @GetMapping(path = "list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Naruto"), new Anime("DBZ"));
    }

}
