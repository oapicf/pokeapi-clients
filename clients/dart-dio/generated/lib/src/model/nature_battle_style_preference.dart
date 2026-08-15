//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_battle_style_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'nature_battle_style_preference.g.dart';

/// NatureBattleStylePreference
///
/// Properties:
/// * [lowHpPreference] 
/// * [highHpPreference] 
/// * [moveBattleStyle] 
@BuiltValue()
abstract class NatureBattleStylePreference implements Built<NatureBattleStylePreference, NatureBattleStylePreferenceBuilder> {
  @BuiltValueField(wireName: r'low_hp_preference')
  int get lowHpPreference;

  @BuiltValueField(wireName: r'high_hp_preference')
  int get highHpPreference;

  @BuiltValueField(wireName: r'move_battle_style')
  MoveBattleStyleSummary get moveBattleStyle;

  NatureBattleStylePreference._();

  factory NatureBattleStylePreference([void updates(NatureBattleStylePreferenceBuilder b)]) = _$NatureBattleStylePreference;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(NatureBattleStylePreferenceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<NatureBattleStylePreference> get serializer => _$NatureBattleStylePreferenceSerializer();
}

class _$NatureBattleStylePreferenceSerializer implements PrimitiveSerializer<NatureBattleStylePreference> {
  @override
  final Iterable<Type> types = const [NatureBattleStylePreference, _$NatureBattleStylePreference];

  @override
  final String wireName = r'NatureBattleStylePreference';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    NatureBattleStylePreference object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'low_hp_preference';
    yield serializers.serialize(
      object.lowHpPreference,
      specifiedType: const FullType(int),
    );
    yield r'high_hp_preference';
    yield serializers.serialize(
      object.highHpPreference,
      specifiedType: const FullType(int),
    );
    yield r'move_battle_style';
    yield serializers.serialize(
      object.moveBattleStyle,
      specifiedType: const FullType(MoveBattleStyleSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    NatureBattleStylePreference object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required NatureBattleStylePreferenceBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'low_hp_preference':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.lowHpPreference = valueDes;
          break;
        case r'high_hp_preference':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.highHpPreference = valueDes;
          break;
        case r'move_battle_style':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveBattleStyleSummary),
          ) as MoveBattleStyleSummary;
          result.moveBattleStyle.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  NatureBattleStylePreference deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = NatureBattleStylePreferenceBuilder();
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

