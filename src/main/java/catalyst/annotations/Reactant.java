package catalyst.annotations;

import java.lang.annotation.*;

/**
 * A marker annotation for a payload which is to be inserted into a {@link catalyst.api.DataSource}. This allows for
 * implementations to utilize annotation scanning at compile-time to optimize potential data structures and queries.
 * <p>
 * <b>Note:</b> It is expected every payload contain at least one {@link catalyst.annotations.PrimaryIndex} field and may or
 * may not contain one or more {@link catalyst.annotations.SecondaryIndex} fields.
 *
 * @see catalyst.api.DataSource
 * @see catalyst.annotations.PrimaryIndex
 * @see catalyst.annotations.SecondaryIndex
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Reactant {
}
