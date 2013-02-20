package slab

import geb.Page
import geb.Browser

class SlabPage extends Page{
    static String url = "http://localhost:3000/slab?eventName=Event%20Name"

    static content = {
        slider{id->
            $('div', id: id)
        }
    }
    
}
