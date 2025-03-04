import org.mycompany.Utils

def call(String name) {
    def message = Utils.greet(name)
    echo message
}
