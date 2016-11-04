package Illiushchenia.component.binding;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class TigerReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object target, Method method, Object[] args) {
        return "A ferocious tiger"; // Помещает тигра в ящик
    }
}
