//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ability_detail_pokemon_inner.g.dart';

/// AbilityDetailPokemonInner
///
/// Properties:
/// * [isHidden] 
/// * [slot] 
/// * [pokemon] 
@BuiltValue()
abstract class AbilityDetailPokemonInner implements Built<AbilityDetailPokemonInner, AbilityDetailPokemonInnerBuilder> {
  @BuiltValueField(wireName: r'is_hidden')
  bool get isHidden;

  @BuiltValueField(wireName: r'slot')
  int get slot;

  @BuiltValueField(wireName: r'pokemon')
  AbilityDetailPokemonInnerPokemon get pokemon;

  AbilityDetailPokemonInner._();

  factory AbilityDetailPokemonInner([void updates(AbilityDetailPokemonInnerBuilder b)]) = _$AbilityDetailPokemonInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AbilityDetailPokemonInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AbilityDetailPokemonInner> get serializer => _$AbilityDetailPokemonInnerSerializer();
}

class _$AbilityDetailPokemonInnerSerializer implements PrimitiveSerializer<AbilityDetailPokemonInner> {
  @override
  final Iterable<Type> types = const [AbilityDetailPokemonInner, _$AbilityDetailPokemonInner];

  @override
  final String wireName = r'AbilityDetailPokemonInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AbilityDetailPokemonInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'is_hidden';
    yield serializers.serialize(
      object.isHidden,
      specifiedType: const FullType(bool),
    );
    yield r'slot';
    yield serializers.serialize(
      object.slot,
      specifiedType: const FullType(int),
    );
    yield r'pokemon';
    yield serializers.serialize(
      object.pokemon,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AbilityDetailPokemonInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AbilityDetailPokemonInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'is_hidden':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isHidden = valueDes;
          break;
        case r'slot':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.slot = valueDes;
          break;
        case r'pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.pokemon.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AbilityDetailPokemonInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AbilityDetailPokemonInnerBuilder();
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

