package co.gersua.aws;

import com.amazon.speech.json.SpeechletRequestEnvelope;
import com.amazon.speech.speechlet.*;
import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

import java.util.HashSet;
import java.util.Set;

public class SimpleHandler extends SpeechletRequestStreamHandler {

    private static final Set<String> supportedApplicationIds = new HashSet<String>();

    static {
        supportedApplicationIds.add("amzn1.ask.skill.2b3056a5-1827-453b-9a4e-cecb7cb67233");
    }

    public SimpleHandler() {
        super(new SimpleSpeechlet(), supportedApplicationIds);
    }
}
