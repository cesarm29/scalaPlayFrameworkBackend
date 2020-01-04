// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/cesarmayorga/Documents/scala/conf/routes
// @DATE:Wed Dec 11 19:50:35 COT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
