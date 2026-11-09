//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:openapi/src/model/type_summary.dart';
import 'package:openapi/src/model/move_effect_effect_text.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_change.g.dart';

/// MoveChange
///
/// Properties:
/// * [accuracy] - The percent value of how likely this move is to be successful.
/// * [power] - The base power before the listed version group, or null if power did not change.
/// * [pp] - Power points. The number of times this move can be used.
/// * [effectChance] - The percent value of how likely it is this moves effect will take effect.
/// * [effectEntries] - The effect of this move listed in different languages.
/// * [type] - The elemental type of this move.
/// * [versionGroup] - The version group in which these move stat values were in effect.
@BuiltValue()
abstract class MoveChange implements Built<MoveChange, MoveChangeBuilder> {
  /// The percent value of how likely this move is to be successful.
  @BuiltValueField(wireName: r'accuracy')
  int? get accuracy;

  /// The base power before the listed version group, or null if power did not change.
  @BuiltValueField(wireName: r'power')
  int? get power;

  /// Power points. The number of times this move can be used.
  @BuiltValueField(wireName: r'pp')
  int? get pp;

  /// The percent value of how likely it is this moves effect will take effect.
  @BuiltValueField(wireName: r'effect_chance')
  int? get effectChance;

  /// The effect of this move listed in different languages.
  @BuiltValueField(wireName: r'effect_entries')
  BuiltList<MoveEffectEffectText> get effectEntries;

  /// The elemental type of this move.
  @BuiltValueField(wireName: r'type')
  TypeSummary? get type;

  /// The version group in which these move stat values were in effect.
  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  MoveChange._();

  factory MoveChange([void updates(MoveChangeBuilder b)]) = _$MoveChange;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveChangeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveChange> get serializer => _$MoveChangeSerializer();
}

class _$MoveChangeSerializer implements PrimitiveSerializer<MoveChange> {
  @override
  final Iterable<Type> types = const [MoveChange, _$MoveChange];

  @override
  final String wireName = r'MoveChange';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveChange object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.accuracy != null) {
      yield r'accuracy';
      yield serializers.serialize(
        object.accuracy,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.power != null) {
      yield r'power';
      yield serializers.serialize(
        object.power,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.pp != null) {
      yield r'pp';
      yield serializers.serialize(
        object.pp,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'effect_chance';
    yield object.effectChance == null ? null : serializers.serialize(
      object.effectChance,
      specifiedType: const FullType.nullable(int),
    );
    yield r'effect_entries';
    yield serializers.serialize(
      object.effectEntries,
      specifiedType: const FullType(BuiltList, [FullType(MoveEffectEffectText)]),
    );
    yield r'type';
    yield object.type == null ? null : serializers.serialize(
      object.type,
      specifiedType: const FullType.nullable(TypeSummary),
    );
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(VersionGroupSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveChange object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveChangeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'accuracy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.accuracy = valueDes;
          break;
        case r'power':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.power = valueDes;
          break;
        case r'pp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.pp = valueDes;
          break;
        case r'effect_chance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.effectChance = valueDes;
          break;
        case r'effect_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveEffectEffectText)]),
          ) as BuiltList<MoveEffectEffectText>;
          result.effectEntries.replace(valueDes);
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TypeSummary),
          ) as TypeSummary?;
          if (valueDes == null) continue;
          result.type.replace(valueDes);
          break;
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionGroupSummary),
          ) as VersionGroupSummary;
          result.versionGroup.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveChange deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveChangeBuilder();
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


