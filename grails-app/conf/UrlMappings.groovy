class UrlMappings {

	static mappings = {
        "/slab"(controller:"slab", action="index")

		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}


		"/"(view:"/index")
		"500"(view:'/error')
	}
}
