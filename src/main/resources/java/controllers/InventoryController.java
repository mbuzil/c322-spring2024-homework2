package main.resources.java.controllers;

@RestController
@RequestMapping("/inventory")
public class InventoryController {


    @GetMapping("/search")
    public List<Guitar> searchGuitars(@RequestParam Guitar g) {
        for(int i = 0; i < guitars.size(); i++)
        {
            if(guitars.get(i) == g)
                return(guitars.get(i));
        }
        return(null);
    }

    @PostMapping("/add")
    public void addGuitar(@RequestBody Guitar guitar) {
        inventoryRepository.addGuitar(guitar);
    }

    @GetMapping("/find/{serialNumber}")
    public Guitar findGuitar(@PathVariable String serialNumber) {
        return inventoryRepository.getGuitar(serialNumber);
    }
}
