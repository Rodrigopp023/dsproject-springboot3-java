mvn clean compile

if [ $? -eq 0 ]; then
    echo "Compilation successful!"
    echo "Running the application..."
    java -cp target/classes:$(mvn dependency:build-classpath -Dmdep.outputFile=/dev/stdout -q -DincludeScope=runtime) com.mysite.dsprojectspring3.Dsprojectspring3Application
else
    echo "Compilation failed."
fi
