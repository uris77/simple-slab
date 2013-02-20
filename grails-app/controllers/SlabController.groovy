import geb.Browser
import slab.SlabPage

class SlabController {
    def index(){
        println "\nParms: ${params}"
        def view = 'index'
        switch(params.screenSize){
            case '320x356':
                view = '320x356'
                break
            case '480x208':
                view = '480x208'
                break
            default:
                view = 'index'
        }
        println "using view: ${view}"
        render view: view
    }

    def drive(){
        Browser.drive{
            to SlabPage
            //println "slider: ${slider}"
            println slider('slider')
            println slider('slider').html()
        }

        render view: 'drive'
    }
}

