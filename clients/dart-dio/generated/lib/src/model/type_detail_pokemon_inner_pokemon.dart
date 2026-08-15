//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'type_detail_pokemon_inner_pokemon.g.dart';

/// TypeDetailPokemonInnerPokemon
///
/// Properties:
/// * [name] - The name of the pokemon
/// * [url] - The URL to get more information about the pokemon
@BuiltValue()
abstract class TypeDetailPokemonInnerPokemon implements Built<TypeDetailPokemonInnerPokemon, TypeDetailPokemonInnerPokemonBuilder> {
  /// The name of the pokemon
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// The URL to get more information about the pokemon
  @BuiltValueField(wireName: r'url')
  String? get url;

  TypeDetailPokemonInnerPokemon._();

  factory TypeDetailPokemonInnerPokemon([void updates(TypeDetailPokemonInnerPokemonBuilder b)]) = _$TypeDetailPokemonInnerPokemon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TypeDetailPokemonInnerPokemonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TypeDetailPokemonInnerPokemon> get serializer => _$TypeDetailPokemonInnerPokemonSerializer();
}

class _$TypeDetailPokemonInnerPokemonSerializer implements PrimitiveSerializer<TypeDetailPokemonInnerPokemon> {
  @override
  final Iterable<Type> types = const [TypeDetailPokemonInnerPokemon, _$TypeDetailPokemonInnerPokemon];

  @override
  final String wireName = r'TypeDetailPokemonInnerPokemon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TypeDetailPokemonInnerPokemon object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
  }

  @override
  Object serialize(
    Serializers serializers,
    TypeDetailPokemonInnerPokemon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TypeDetailPokemonInnerPokemonBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TypeDetailPokemonInnerPokemon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TypeDetailPokemonInnerPokemonBuilder();
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

