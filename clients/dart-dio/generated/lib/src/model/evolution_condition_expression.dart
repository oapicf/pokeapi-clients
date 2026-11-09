//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/evolution_variable_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'evolution_condition_expression.g.dart';

/// EvolutionConditionExpression
///
/// Properties:
/// * [expression] - Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
/// * [percentageChance] - Percentage chance of evolution under this condition (0-100)
/// * [variables] - Evolution variables referenced in the expression
@BuiltValue()
abstract class EvolutionConditionExpression implements Built<EvolutionConditionExpression, EvolutionConditionExpressionBuilder> {
  /// Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
  @BuiltValueField(wireName: r'expression')
  String get expression;

  /// Percentage chance of evolution under this condition (0-100)
  @BuiltValueField(wireName: r'percentage_chance')
  double? get percentageChance;

  /// Evolution variables referenced in the expression
  @BuiltValueField(wireName: r'variables')
  BuiltList<EvolutionVariableSummary> get variables;

  EvolutionConditionExpression._();

  factory EvolutionConditionExpression([void updates(EvolutionConditionExpressionBuilder b)]) = _$EvolutionConditionExpression;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EvolutionConditionExpressionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EvolutionConditionExpression> get serializer => _$EvolutionConditionExpressionSerializer();
}

class _$EvolutionConditionExpressionSerializer implements PrimitiveSerializer<EvolutionConditionExpression> {
  @override
  final Iterable<Type> types = const [EvolutionConditionExpression, _$EvolutionConditionExpression];

  @override
  final String wireName = r'EvolutionConditionExpression';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EvolutionConditionExpression object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'expression';
    yield serializers.serialize(
      object.expression,
      specifiedType: const FullType(String),
    );
    yield r'percentage_chance';
    yield object.percentageChance == null ? null : serializers.serialize(
      object.percentageChance,
      specifiedType: const FullType.nullable(double),
    );
    yield r'variables';
    yield serializers.serialize(
      object.variables,
      specifiedType: const FullType(BuiltList, [FullType(EvolutionVariableSummary)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EvolutionConditionExpression object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EvolutionConditionExpressionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'expression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.expression = valueDes;
          break;
        case r'percentage_chance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.percentageChance = valueDes;
          break;
        case r'variables':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EvolutionVariableSummary)]),
          ) as BuiltList<EvolutionVariableSummary>;
          result.variables.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EvolutionConditionExpression deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EvolutionConditionExpressionBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


