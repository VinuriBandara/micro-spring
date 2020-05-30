package lk.ac.ucsc.currencyconversion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// the proxy is the middle man acting as if he's doing work
//@FeignClient(name="forex-service", url="localhost:8000")
//public interface CurrencyExchangeServiceProxy {
//    @GetMapping("/currency-exchange/from/{from}/to/{to}")
//    public CurrencyConversionBean retrieveExchangeValue
//            (@PathVariable("from") String from, @PathVariable("to") String to);
//}


@FeignClient(name="forex-service")
@RibbonClient(name="forex-service")
    public interface CurrencyExchangeServiceProxy {
        @GetMapping("/currency-exchange/from/{from}/to/{to}")
        public CurrencyConversionBean retrieveExchangeValue
                (@PathVariable("from") String from, @PathVariable("to") String to);
    }

