//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_form_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_form_trigger_condition.g.dart';

/// PokemonFormTriggerCondition
///
/// Properties:
/// * [trigger] - The trigger for this form change.
/// * [name] - The name of the required item, ability, or move. Only present for a resource-based trigger.
/// * [url] - The URL of the required item, ability, or move. Only present for a resource-based trigger.
/// * [baseForm] - The required base form. Only present when the trigger specifies one.
@BuiltValue()
abstract class PokemonFormTriggerCondition implements Built<PokemonFormTriggerCondition, PokemonFormTriggerConditionBuilder> {
  /// The trigger for this form change.
  @BuiltValueField(wireName: r'trigger')
  String get trigger;

  /// The name of the required item, ability, or move. Only present for a resource-based trigger.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// The URL of the required item, ability, or move. Only present for a resource-based trigger.
  @BuiltValueField(wireName: r'url')
  String? get url;

  /// The required base form. Only present when the trigger specifies one.
  @BuiltValueField(wireName: r'base_form')
  PokemonFormSummary? get baseForm;

  PokemonFormTriggerCondition._();

  factory PokemonFormTriggerCondition([void updates(PokemonFormTriggerConditionBuilder b)]) = _$PokemonFormTriggerCondition;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonFormTriggerConditionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonFormTriggerCondition> get serializer => _$PokemonFormTriggerConditionSerializer();
}

class _$PokemonFormTriggerConditionSerializer implements PrimitiveSerializer<PokemonFormTriggerCondition> {
  @override
  final Iterable<Type> types = const [PokemonFormTriggerCondition, _$PokemonFormTriggerCondition];

  @override
  final String wireName = r'PokemonFormTriggerCondition';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonFormTriggerCondition object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'trigger';
    yield serializers.serialize(
      object.trigger,
      specifiedType: const FullType(String),
    );
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.url != null) {
      yield r'url';
      yield serializers.serialize(
        object.url,
        specifiedType: const FullType(String),
      );
    }
    if (object.baseForm != null) {
      yield r'base_form';
      yield serializers.serialize(
        object.baseForm,
        specifiedType: const FullType(PokemonFormSummary),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonFormTriggerCondition object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonFormTriggerConditionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'trigger':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.trigger = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.url = valueDes;
          break;
        case r'base_form':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PokemonFormSummary),
          ) as PokemonFormSummary?;
          if (valueDes == null) continue;
          result.baseForm.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonFormTriggerCondition deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonFormTriggerConditionBuilder();
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


