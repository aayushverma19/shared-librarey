 import org.example.Utils

def call(String name = 'World') {
    def message = Utils.getHelloMessage(name)
    echo message

       // echo "hello ${name}"  // only use vars file and comment import org.example.Utils, def message = Utils.getHelloMessage(name)
}
