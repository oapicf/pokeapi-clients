//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_change_effect_entries_inner.g.dart';

/// MoveChangeEffectEntriesInner
///
/// Properties:
/// * [effect] 
/// * [shortEffect] 
/// * [language] 
@BuiltValue()
abstract class MoveChangeEffectEntriesInner implements Built<MoveChangeEffectEntriesInner, MoveChangeEffectEntriesInnerBuilder> {
  @BuiltValueField(wireName: r'effect')
  String get effect;

  @BuiltValueField(wireName: r'short_effect')
  String get shortEffect;

  @BuiltValueField(wireName: r'language')
  AbilityDetailPokemonInnerPokemon get language;

  MoveChangeEffectEntriesInner._();

  factory MoveChangeEffectEntriesInner([void updates(MoveChangeEffectEntriesInnerBuilder b)]) = _$MoveChangeEffectEntriesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveChangeEffectEntriesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveChangeEffectEntriesInner> get serializer => _$MoveChangeEffectEntriesInnerSerializer();
}

class _$MoveChangeEffectEntriesInnerSerializer implements PrimitiveSerializer<MoveChangeEffectEntriesInner> {
  @override
  final Iterable<Type> types = const [MoveChangeEffectEntriesInner, _$MoveChangeEffectEntriesInner];

  @override
  final String wireName = r'MoveChangeEffectEntriesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveChangeEffectEntriesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'effect';
    yield serializers.serialize(
      object.effect,
      specifiedType: const FullType(String),
    );
    yield r'short_effect';
    yield serializers.serialize(
      object.shortEffect,
      specifiedType: const FullType(String),
    );
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveChangeEffectEntriesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveChangeEffectEntriesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'effect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.effect = valueDes;
          break;
        case r'short_effect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.shortEffect = valueDes;
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.language.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveChangeEffectEntriesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveChangeEffectEntriesInnerBuilder();
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

