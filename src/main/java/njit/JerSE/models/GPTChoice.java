package njit.JerSE.models;

/**
 * Represents a choice provided by the ChatGPT API as part of its response.
 * <p>
 * In the context of the ChatGPT API, each request can result in multiple potential outputs or 'choices'.
 * This record captures one individual choice with its details.
 *
 * <p><strong>Note:</strong> It's important that the field names remain in snake_case for API compatibility.
 *
 * @param index         the position or ranking of this choice among others
 * @param message       the {@link GPTMessage} object that encapsulates the content and role of this choice
 * TODO: Is this usually empty (or maybe null)?
 * @param finish_reason the reason provided by ChatGPT for concluding or stopping at this choice
 */
public record GPTChoice(
        int index,
        GPTMessage message,
        String finish_reason
) {}
