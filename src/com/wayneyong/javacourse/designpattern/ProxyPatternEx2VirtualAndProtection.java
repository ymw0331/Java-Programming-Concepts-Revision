package com.wayneyong.javacourse.designpattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Proxy Pattern -
 * <p>
 * Use the proxy pattern to create a representative object
 * that controls access to another object.
 * <p>
 * Types -
 * Remote Proxy - for accessing a remote object
 * Virtual Proxy - for deferred initialization
 * Protection Proxy - for secured and controlled access to the object
 */

interface Dict {
    Optional<String> getMeaning(String word);

    void modify(String word, String meaning);
}

class DictImpl implements Dict {
    private Map<String, String> dict = new HashMap();

    @Override
    public Optional<String> getMeaning(String word) {
        String meaning = dict.get(word);
        if (meaning == null) {
            return Optional.empty();
        } else {
            return Optional.of(meaning);
        }
    }

    @Override
    public void modify(String word, String meaning) {
        dict.put(word, meaning);
    }
}

class VirtualProxyDictImpl implements Dict {
    //lazy initialization
    private DictImpl dict = null;

    private Dict getDictionary() {
        if (dict == null) {
            System.out.println("Dictionary object created/initialized");
            dict = new DictImpl();
        }
        return dict;
    }

    @Override
    public Optional<String> getMeaning(String word) {
        return getDictionary().getMeaning(word);
    }

    @Override
    public void modify(String word, String meaning) {
        getDictionary().modify(word, meaning);
    }
}

//protection proxy
class ReadOnlyDictionary implements Dict {

    private Dict dict = new DictImpl();

    @Override
    public Optional<String> getMeaning(String word) {
        return dict.getMeaning(word);
    }

    @Override
    public void modify(String word, String meaning) {
        throw new UnsupportedOperationException("read only, you cannot modify");
    }
}

public class ProxyPatternEx2VirtualAndProtection {
    public static void main(String[] args) {
        //virtual proxy is helping to create an object, whenever it is needed
        Dict dict = new VirtualProxyDictImpl();
        dict.modify("some", "some meaning");

        Dict dict1 = new ReadOnlyDictionary();
        dict1.modify("Jsome", "somemeanin");
    }
}
