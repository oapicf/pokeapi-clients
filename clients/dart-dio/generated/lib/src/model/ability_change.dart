//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:openapi/src/model/ability_change_effect_text.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ability_change.g.dart';

/// AbilityChange
///
/// Properties:
/// * [versionGroup] 
/// * [effectEntries] 
@BuiltValue()
abstract class AbilityChange implements Built<AbilityChange, AbilityChangeBuilder> {
  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  @BuiltValueField(wireName: r'effect_entries')
  BuiltList<AbilityChangeEffectText> get effectEntries;

  AbilityChange._();

  factory AbilityChange([void updates(AbilityChangeBuilder b)]) = _$AbilityChange;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AbilityChangeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AbilityChange> get serializer => _$AbilityChangeSerializer();
}

class _$AbilityChangeSerializer implements PrimitiveSerializer<AbilityChange> {
  @override
  final Iterable<Type> types = const [AbilityChange, _$AbilityChange];

  @override
  final String wireName = r'AbilityChange';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AbilityChange object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(VersionGroupSummary),
    );
    yield r'effect_entries';
    yield serializers.serialize(
      object.effectEntries,
      specifiedType: const FullType(BuiltList, [FullType(AbilityChangeEffectText)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AbilityChange object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AbilityChangeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionGroupSummary),
          ) as VersionGroupSummary;
          result.versionGroup.replace(valueDes);
          break;
        case r'effect_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityChangeEffectText)]),
          ) as BuiltList<AbilityChangeEffectText>;
          result.effectEntries.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AbilityChange deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AbilityChangeBuilder();
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

