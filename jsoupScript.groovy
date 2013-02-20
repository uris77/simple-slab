@Grapes([
@Grab(group='org.jsoup', module='jsoup', version='1.7.2'),
@Grab(group='commons-lang', module='commons-lang', version='2.4')
])
import org.apache.commons.lang.StringEscapeUtils
/*
org.jsoup.nodes.Document portrait = org.jsoup.Jsoup.connect("http://localhost:3000/slab?eventName=MarionetteJS%20is%20just%20freaking%20Awesome&screenSize=320x356").get()
org.jsoup.select.Elements portriatElement = portrait.select('#slider ul > li')
println "\n\n############ PORTRIAT ########################"
println "portriat Element: "
println portriatElement
org.jsoup.nodes.Document landscape = org.jsoup.Jsoup.connect("http://localhost:3000/slab?eventName=MarionetteJS%20is%20just%20freaking%20Awesome&screenSize=480x208").get()
org.jsoup.select.Elements landscapeElement = landscape.select('#slider ul > li')
println "\n\n############ LANDSCAPE ########################"
println "landscape Element: "
println landscapeElement
org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect("http://localhost:3000/slab?eventName=MarionetteJS%20is%20just%20freaking%20Awesome").get()
org.jsoup.select.Elements slider = doc.select('#slider ul > li')
println "\n\n############ DEFAULT ########################"
println "slider: "
println slider.first()
org.jsoup.select.Elements landscapeEl = doc.select('#480x208 ul > li')
println "\n\nlandscape: "
println landscapeEl.first()
org.jsoup.select.Elements portriatEl = doc.select('#320x356 ul > li')
println "\n\nportrait: "
println portriatEl.first()
*/
//String url = "http://localhost:8080/uppercut/crawl?eventName="
String name = "Marionettejs is Just Freaking AweSome"
//String host = "dev.chicago.com.local:3001"
//String path = "/slab"
String host = "localhost:3000"
String path = "/slab"
java.net.URI _url = new java.net.URI("http", host, path, "eventName=${name}", null)
println "uri.toString(): ${_url.toString()}"
org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(_url.toURL().toString()).get()
org.jsoup.select.Elements landscapeEl = doc.select('#480x208')
println "\n\nlandscape: " + landscapeEl
println landscapeEl.first()
org.jsoup.select.Elements portriatEl = doc.select('#320x356')
println "\n\nportrait: "
println portriatEl.first()

org.jsoup.select.Elements bodyEl = doc.select('html')
println "\nbody: " + bodyEl.first()
