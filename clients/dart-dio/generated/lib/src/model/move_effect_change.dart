//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_effect_change_effect_text.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_effect_change.g.dart';

/// MoveEffectChange
///
/// Properties:
/// * [versionGroup] - The version group in which the previous effect of this ability originated.
/// * [effectEntries] - The previous effect of this ability listed in different languages.
@BuiltValue()
abstract class MoveEffectChange implements Built<MoveEffectChange, MoveEffectChangeBuilder> {
  /// The version group in which the previous effect of this ability originated.
  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  /// The previous effect of this ability listed in different languages.
  @BuiltValueField(wireName: r'effect_entries')
  BuiltList<MoveEffectChangeEffectText> get effectEntries;

  MoveEffectChange._();

  factory MoveEffectChange([void updates(MoveEffectChangeBuilder b)]) = _$MoveEffectChange;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveEffectChangeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveEffectChange> get serializer => _$MoveEffectChangeSerializer();
}

class _$MoveEffectChangeSerializer implements PrimitiveSerializer<MoveEffectChange> {
  @override
  final Iterable<Type> types = const [MoveEffectChange, _$MoveEffectChange];

  @override
  final String wireName = r'MoveEffectChange';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveEffectChange object, {
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
      specifiedType: const FullType(BuiltList, [FullType(MoveEffectChangeEffectText)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveEffectChange object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveEffectChangeBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(MoveEffectChangeEffectText)]),
          ) as BuiltList<MoveEffectChangeEffectText>;
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
  MoveEffectChange deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveEffectChangeBuilder();
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


